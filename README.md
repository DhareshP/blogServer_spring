Blog Server Application

This is a Spring Boot-based blog server that allows users to create and manage blog posts. The server is integrated with a MySQL database for data persistence.

Features
Post Entity: Stores blog posts with attributes such as content, author name, tags, image, date, and metadata like view and like counts.
Create Post API: Allows users to create a blog post by sending a POST request with the post's content and metadata.
MySQL Database Integration: Stores all blog post data in a MySQL database for permanent storage.
Post Entity
The Post entity is a JPA entity that maps to the blog posts stored in the database. It includes the following fields:

id: Unique identifier for each post (auto-generated).
name: Title of the blog post.
content: The main body of the blog post (maximum length: 5000 characters).
postedBy: The author of the post.
img: An image associated with the post.
date: The date when the post was published.
likeCount and viewCount: Track the number of likes and views for the post.
tags: A list of tags associated with the post to categorize it.
API Endpoints
1. Create a New Post
POST /api/posts

Request Body: JSON object with the post's data (title, content, author, etc.).
Response: Returns the created post with a 201 status code upon success. In case of server errors, returns a 500 status code.
Database Configuration
The application is connected to a MySQL database, and the configuration is set in the application.properties file:

application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/blog_server
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Database URL: jdbc:mysql://localhost:3306/blog_server connects to a MySQL database named blog_server.
Hibernate Settings: Auto-updates the database schema based on the Post entity. SQL statements are logged for debugging purposes.
Running the Application
Set up MySQL Database:

Ensure MySQL is installed and running.
Create a database named blog_server.
Configure application.properties:

Update the database URL, username, and password as per your environment.
Run the Application:

Use Maven or your preferred IDE to run the Spring Boot application.
Access the API:

The API is accessible via http://localhost:8080/api/posts for creating posts.
