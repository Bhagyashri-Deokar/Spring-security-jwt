**Spring Security is essentially just a bunch of servlet filters that enable Java applications to include authentication and authorization functionality. It is one of the most powerful, and highly customizable access-control frameworks (security framework) that provide authentication, authorization, and other security features for Java EE (Enterprise edition) based enterprise applications. The real power of Spring Security lies in its ability to be extended to meet custom needs. Its main responsibility is to authenticate and authorize incoming requests for accessing any resource, including rest API endpoints, MVC (Model-View-Controller) URLs, static resources, etc.  
**



# Spring-security-jwt
Steps to implement jwt token:
1)  Make sure spring-boot-starter-security is there in pom.xml
2)  Create Class JWTAthenticationEntryPoint that implement AuthenticationEntryPoint. Method of this class is called whenever as exception is thrown due to unauthenticated user trying to access the resource that required authentication.
3)  Create JWTHelper  class This class contains method related to perform operations with jwt token like generateToken, validateToken etc.
4)   Create JWTAuthenticationFilter that extends OncePerRequestFilter and override method and write the logic to check the token that is comming in header. We have to write 5 important logic

Get Token from request
Validate Token
GetUsername from token
Load user associated with this token
set authentication
5) Configure spring security in configuration file:
6) Create JWTRequest and JWTResponse to receive request data and send Login success response.
7) Create login api to accept username and password and return token if username and password is correct.
