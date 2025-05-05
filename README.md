# 🤖 OpenAI Chat API with Spring Boot

This project is a simple REST API built using **Spring Boot** and **Spring AI's OpenAiChatModel** to interact with OpenAI's GPT models. It allows users to send a message and receive a smart AI-generated response.

---

## 🚀 Features

- ✅ REST API to send messages to OpenAI and receive responses
- 🌐 CORS enabled for frontend integration
- 💬 Clean controller logic using `OpenAiChatModel`
- ⚙️ Easy to plug into any frontend (React, Angular, etc.)

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring AI
- Maven

---

## 🔧 Setup Instructions

### 1. Clone the Repo

```bash
git clone https://github.com/your-username/openai-chat-api.git
cd openai-chat-api
2. Add OpenAI API Key
In src/main/resources/application.properties:

properties
Copy code
spring.ai.openai.api-key=your_openai_api_key_here
3. Run the Application
bash
Copy code
mvn spring-boot:run

📡 API Endpoint
POST /api/chat
Send a plain text message to the AI and get a response.

Request
bash
Copy code
POST /api/chat
Content-Type: text/plain

Hello! How are you?

Response
json
Copy code
"I'm an AI model here to help! How can I assist you today?"
