Blog Server Application(Spring + Angular)
This is a Spring Boot-based blog server that allows users to create and manage blog posts. The server is integrated with a MySQL database for data persistence.

Features
Post Entity: Stores blog posts with attributes such as content, author name, tags, image, date, and metadata like view and like counts.
Create Post API: Allows users to create a blog post by sending a POST request with the post's content and metadata.
MySQL Database Integration: Stores all blog post data in a MySQL database for permanent storage.
Post Entity
The Post entity is a JPA entity that maps to the blog posts stored in the database. It includes:

id: Unique identifier for each post (auto-generated).
name: Title of the blog post.
content: The main body of the blog post (with a maximum length of 5000 characters).
postedBy: The author of the post.
img: An image associated with the post.
date: The date when the post was published.
likeCount and viewCount: Keep track of the number of likes and views for the post.
tags: A list of tags associated with the post to categorize it.
API Endpoints
Create a New Post
POST /api/posts

Request Body: JSON object with the post's data (title, content, author, etc.).
Response: Returns the created post with a 201 status code upon success. In case of server errors, it returns a 500 status code.

Configuration
The application is connected to a MySQL database. The application.properties file includes the database configuration:
Database URL: jdbc:mysql://localhost:3306/blog_server connects to a MySQL database named blog_server.
Username and Password: Default credentials (root/root).
Hibernate Settings: Auto-updates the database schema based on the Post entity. SQL statements are logged for debugging.


Here’s a description you can add to your GitHub repository's README file to explain how the system works:

Blog Server Application
This is a Spring Boot-based blog server that allows users to create and manage blog posts. The server is integrated with a MySQL database for data persistence.

Features
Post Entity: Stores blog posts with attributes such as content, author name, tags, image, date, and metadata like view and like counts.
Create Post API: Allows users to create a blog post by sending a POST request with the post's content and metadata.
MySQL Database Integration: Stores all blog post data in a MySQL database for permanent storage.
Post Entity
The Post entity is a JPA entity that maps to the blog posts stored in the database. It includes:

id: Unique identifier for each post (auto-generated).
name: Title of the blog post.
content: The main body of the blog post (with a maximum length of 5000 characters).
postedBy: The author of the post.
img: An image associated with the post.
date: The date when the post was published.
likeCount and viewCount: Keep track of the number of likes and views for the post.
tags: A list of tags associated with the post to categorize it.
API Endpoints
Create a New Post
POST /api/posts

Request Body: JSON object with the post's data (title, content, author, etc.).
Response: Returns the created post with a 201 status code upon success. In case of server errors, it returns a 500 status code.
Example request body:

json
Copy code
{
  "name": "Spring Boot Guide",
  "content": "This is a comprehensive guide on Spring Boot...",
  "postedBy": "John Doe",
  "img": "image_url",
  "tags": ["Spring", "Java", "Backend"]
}
Configuration
The application is connected to a MySQL database. The application.properties file includes the database configuration:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/blog_server
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Database URL: jdbc:mysql://localhost:3306/blog_server connects to a MySQL database named blog_server.
Username and Password: Default credentials (root/root).
Hibernate Settings: Auto-updates the database schema based on the Post entity. SQL statements are logged for debugging.
Running the Application
Set up a MySQL database and configure the application.properties file with the appropriate credentials and connection URL.
Run the application using Maven or your preferred IDE.
Access the API via http://localhost:8080/api/posts to create posts.
