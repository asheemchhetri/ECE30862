Java web application build with Java using Spring Framework and Maven Dependencies, JSTL, DAO, MVC, ORM, etc.


 How to run this project:

 1. Store the uncompressed folder in a proper location.

 2. Install IntelliJ IDEA(free version will work), as it is not Eclipse-based due to complexities Eclipse was presenting.

 3. Install H2 database, it is open source.

 4. Install Apache Tomcat for server features to run on the local host.

 5. Go to the installed location of H2, and open bin folder and run H2 batch file and it takes us to a new webpage.

 6. Choose Generic server H2 in saved settings option and copy the JDBC url.

 7. Now go to the file web app => WEB_INF => open the file applicationContext.xml

 8. On line 10, replace the value field with the JDBC URL you copied earlier.

 9. Setup Apache server fro IntelliJ by a quick google search, How to setup Tomact server for IntelliJ?, the process takes roughly 1 minute.

 10. While setting up the server, make sure to setup the Application Context field under deployment to /eMusicStore.

 11. Turn on the H2 database by login in, with the default username and password and run the application from IntelliJ IDEA, and it should be running fine.
