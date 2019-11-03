Steps to run the Project

Please find git hub url for the assignment. 

Download the application directly from the url https://github.com/munikumar555/BookingBoss

Or 

Clone the repository using below commands.

git config --global http.sslVerify false (work around to avoid ssl certificate issue while cloning)

Clone the repository using following command:

git clone https://github.com/munikumar555/BookingBoss.git


After cloning the repository, use maven to build the project. Use following command to build the application.

C:\Users\muni\BookingBoss\booking-boss>  mvn clean install


Use Java tool to run the application


C:\Users\muni\BookingBoss\booking-boss >  java  -jar target/booking-boss-0.0.1-SNAPSHOT.jar



Application will be running in 8080 port. Below are the sample request for Post and get  requests.


Store Products Request/Response:

Request Url : http://localhost:8080/store-products
Request Type: POST
Content-Type: application/json


Request:

{
  "id": "123",
  "timestamp": "2019-11-03T06:59:01.223+0000",
  "products": [
    {
      "id": "1",
      "name": "Test Product",
      "quantity": "1",
      "sale_amount": "25"
    }
  ]
}


Response: 

{
 "status" :  200,
 "message" : "success"

}


Get Product Request/Response:

Request Url :  http://localhost:8080/get-products/123
Request Type:  GET


Sample Response for above request:

{
  "id": 123,
  
   "timestamp": "2019-11-03T06:59:01.223+0000",
 
   "products": [

    {
      
	"id": 1,
      
	"name": "Test Product",
      
	"quantity": 1,
      
	"sale_amount": 25
    
    }
  
  ]

}
