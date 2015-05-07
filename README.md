# linguo-core
Example give simple Spring Data Rest API use case
#Start
On local env if maven and java installed you could start it using
mvn tomcat7:run
#Description
Profile has not embed location
Location created separatly
Application deployed to http://swap-lingvo-api.elasticbeanstalk.com/
With description of all APIs

#Exapmle
There example of post in ../linguo-core/src/main/resources

1 post location to
http://swap-lingvo-api.elasticbeanstalk.com/location

'''
{
  "city": "Sydney",
  "country": "country",
  "lat": -1,
  "lng": 1
}
'''

post ro profile to create profile

http://swap-lingvo-api.elasticbeanstalk.com/profile

'''
{
  "email": "email",
  "firstName": "firstName",
  "lastName": "lastName",
  "birthDate": "1985-10-07T00:00:00.000+0000",
  "sex": "MALE",
  "location": "http://swap-lingvo-api.elasticbeanstalk.com/location/2",
  "imageUrl": "imageUrl"
}
'''

check profile
http://swap-lingvo-api.elasticbeanstalk.com/profile/2

check profile location
http://swap-lingvo-api.elasticbeanstalk.com/profile/2/location
