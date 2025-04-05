# 💳 Stripe Payment Processing System

This project is a secure and modular payment processing system built using **Spring Boot** and **Microservices architecture**, integrated with **Stripe APIs** to handle online payments efficiently and reliably.

## ⚙️ Features

- Stripe session creation, retrieval, and expiration
- Stripe webhook notification processing
- Payment status tracking with 100% reliability
- Secure HMAC-SHA256 signature verification
- Error handling with Spring exception mechanism
- Asynchronous communication using ActiveMQ
- Modular design using Factory and Builder patterns
- Logs and monitors payment events

## 🛠 Tech Stack

- **Backend:** Java, Spring Boot, Microservices
- **Messaging:** ActiveMQ
- **Database:** MySQL
- **Security:** HMAC-SHA256 for webhook verification
- **API Integration:** Stripe API
- **Build Tool:** Maven 
- **DevOps:** AWS-hosted

## 📦 How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/your-username/stripe-payment-processing.git
   
2. **Configure your Stripe keys: Add the following in application.properties:**
   ```bash
   stripe.api.key=sk_test_yourSecretKey
   stripe.webhook.secret=whsec_yourWebhookSecret
   
3. **Set up Databases:**
   Create a database: stripe_payment
   Run the SQL schema from: /sql/schema.sql
   
5. **Run the service: Use your IDE or**
   ```bash
   ./mvnw spring-boot:run

## 🚧 Future Improvements       
   - Retry mechanism for failed webhook delivery
   - Admin dashboard for payment tracking
   - Notification system (email/SMS)

## 🤝 Contributing
      Contributions are welcome! Please fork the repo and open a pull request.


