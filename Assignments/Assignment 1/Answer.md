# Problem 1:Design a course registration platform

## Objects and behaviors:
### User:
#### Data:ID,PIN,courseList,indentity
#### Behaviors:registerCourse

### Platform:
#### Data:loginInfomation
#### Behaviors:connectionAvailable,checkAccess,returnConnectionError,returnLoginError

### Course:
#### Data:studentRoster,teacher
#### Behaviors:addStudent,addTeacher

### Internet:
#### Data:status
#### Behaviors:

## Sequence of invoking behaviors on objects

#### RegisteringCourses
Platform regPlatform=new Platform();
if(regPlatform.connectionAvailable(Internet.status)){
	User usr=new User();
	Course info=new Course();
	if(regPlatform.checkAccess(usr.ID,usr.PIN)){//check if login information matches regPlatform.loginInformation

		if(regPlatform.checkIdentity(usr.identity)){//check if usr.identity is a teacher
	
			info.addTeacher(usr);//info.teacher=usr
			usr.registerCourse(info);//usr.courseList+=info

		}
		else{//usr is a student
	
			info.addStudent(usr);//info.studentRoster+=usr
			usr.registerCourse(info);//usr.courseList+=info
	
		}
	}
	else{
		regPlatform.returnLoginError();
	}
}
else
	regPlatform.returnConnectionError();


# Problem 2:Order food in a food delivery app(Like Uber Eats)

## Objects and behaviors:
### User:
#### Data:address,userName,PIN,phoneNumber,paymentInformation
#### Behaviors:orderFood,loginToTheApp,searchInformation,pay

### Restaurant:
#### Data:menu,userName,PIN
#### Behaviors:loginToTheApp,registerInformation

### Internet:
#### Data:
#### Behaviors:available

### App
#### Data:listOfRestaurants
#### Behaviors:returnLoginError,returnConnectionError,noticeRestaurants,noticeUsers

## Sequence of invoking behaviors on objects

##### PostingRestaurantInformation
Restaurant rest
App app
rest.startApp->app
if Internet.available
	if rest.loginToTheApp->rest.userName,rest.PIN:login
		rest.registerInformation->app.listOfResaurants:rest.menu->app.listOfRestaurants
	else
		app.returnLoginError
else
	app.returnConnectionError

##### OrderingFood
User usr
App app
usr.startApp->app
if Internet.available 
	if usr.loginToTheApp->usr.userName,usr.PIN:login
		usr.searchInformation->app.listOfRestaurants
		usr.orderFood
		if usr.pay
			app.noticeRestaurants->usr.address
		else
			app.noticeUsers
	else
		app.returnLoginError
else
	app.returnConnectionError


# Problem 3:Design a platform for buying tickets of local events

## Objects and behaviors:
### User:
#### Data:userName,PIN
#### Behaviors:loginToPlatform,searchEvents,chooseTickets,pay

### Host:
#### Data:userName,PIN,eventInformation
#### Behaviors:loginToPlatform,registerEventInformation

### Website:
#### Data:listOfEvents
#### Behaviors:noticeHost,noticeUser,returnConnectionError,returnLoginError,showList

### Internet:
#### Data:
#### Behaviors:available

## Sequence of invoking behaviors on objects

##### PostingEventInformation
Host host
Website platform
if Internet.available
	if host.loginToPlatform->host.userName,host.PIN:login
		host.registerEventInformation->platform.listOfEvents
	else
		platform.returnLoginError
else
	platform.returnConnectionError

##### BuyingTickets
User usr
Website platform
if Internet.available
	if usr.loginToPlatform->usr.userName,usr.PIN:login
		if usr.searchEvents
			platform.showList->listOfEvents
			if usr.chooseTickets
				if usr.pay
					platform.noticeHost
				else
					platform.noticeUser
			else
		else
	else
		platform.returnLoginError
else
	platform.returnConnectionError


# Problem 4:Buy a computer from Amazon

## Objects and behaviors:
### User:
#### Data:userName,PIN,target,address
#### Behaviors:openPlatform,loginToPlatform,searchComputer,orderComputer,pay

### Platform
#### Data:listOfProducts,userDatabase
#### Behaviors:returnConnectionError,returnLoginError,checkAccess,showList,placeOrder

### Internet
#### Data:
#### Behaviors:available

## Sequence of invoking behaviors on objects

##### BuyingAComputer
User usr
Platform amazon
if usr.openPlatform->amazon
	if Internet.available
		if usr.searchComputer->usr.target
			if amazon.showList->listOfProducts:usr.target
				if usr.orderComputer
					if amazon.checkAccess->usr.loginToPlatform->usr.userName,usr.PIN->amazon.userDatabase
						if usr.pay
							amazon.placeOrder->usr.address
						else
							amazon.noticeUser
					else
						amazon.returnLoginError
				else
			else
		else
	else
		amazon.returnConnectionError
else


# Problem 5:Design an app for booking hotels

## Objects and behaviors:
### User:
#### Data:userName,PIN,destination
#### Behaviors:loginToApp,searchHotels,pay,openApp,chooseHotels

### App
#### Data:listOfHotels,userDatabase,hotelDatabase
#### Behaviors:checkAccess,returnConnectionError,returnLoginError,showList,bookHotels

### Internet
#### Data:
#### Behaviors:available

### Hotel
#### Data:userName,PIN,information
#### Behaviors:registerInformation,loginToApp,openApp

## Sequence of invoking behaviors on objects

##### PostingHotelInformation
Hotel hotel
App app
if hotel.openApp
	if Internet.available
		if hotel.loginToApp->hotel.userName,hotel.PIN:login
			if app.checkAccess->hotel.userName,hotel.PIN->hotelDatabase
				hotel.registerInformation->information->app.listOfHotels
			else
				app.returnLoginError
		else
	else
		app.returnConnectionError
else

##### BookingHotels
User usr
App app
if usr.openApp
	if Internet.available
		if usr.searchHotels->usr.destination
			app.showList->app.listOfHotels->usr.destination
			if usr.chooseHotels->app.listOfHotels
				usr.loginToApp->usr.userName,user.PIN:login
				if app.checkAccess->usr.userName,usr.PIN->userDatabase
					if usr.pay
						app.placeOrder
						app.noticeHotel
					else
						app.noticeUser
				else
					app.returnLoginError
			else
		else
	else
		app.returnConnectionError
else
