#AKIN E-Commerce Platform
A Scalable, Cloud-Ready E-Commerce Backend Built with Java, Spring Boot, and AWS
Overview
AKIN E-Commerce is a scalable and robust e-commerce backend platform developed using Java and Spring Boot, integrated with AWS cloud services to ensure high availability, scalability, and secure operations. This project supports essential e-commerce functionalities such as user authentication, product management, shopping cart operations, order processing, and payment integration.

Key Features
🛡️ Secure Authentication
Role-based access control (Admin and User) using Spring Security and JWT.
Password encryption for enhanced security.
📦 Product Management
CRUD operations for products with support for categories and dynamic pricing.
Product image storage and retrieval using AWS S3.
🛒 Shopping Cart
Add/remove products and dynamically calculate the cart total.
User-specific cart management.
📋 Order Management
Order placement, status tracking, and history retrieval.
Real-time stock updates and management.
💳 Payment Integration
Mock payment processing using Stripe.
Seamless integration with order workflows.
☁️ AWS Deployment
Backend hosted on AWS EC2 with RDS for scalable database management.
AWS S3 for storing static files (product images).
Application load balancing with Elastic Load Balancer (ELB).
📊 Monitoring and Logging
Application performance monitoring via AWS CloudWatch.
Structured logging for debugging and analysis.
Tech Stack
Backend: Java 17+, Spring Boot, Spring Security, JPA
Database: PostgreSQL / AWS RDS
Cloud: AWS EC2, S3, RDS, CloudWatch, ELB
Payment: Stripe API Integration
Build Tool: Maven
Testing: JUnit, Mockito
Version Control: Git

