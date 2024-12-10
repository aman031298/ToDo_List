# ToDo List Application

## Overview

This is a **ToDo List** web application built using **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend. The app allows users to add, update, delete, and view tasks. It's a simple application designed to help you manage your tasks with ease.

  ![image](https://github.com/user-attachments/assets/3f203703-80b5-4832-9528-580b46c749c6)


### Features

- Add new tasks to the list.
- Update existing tasks.
- Delete tasks.
- View the tasks in a clean, simple UI.
- Frontend built with HTML, CSS, and JavaScript.
- Backend built with Spring Boot, connected to a MySQL database.

---

## Technologies Used

- **Backend**: Spring Boot, Java 17, MySQL
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL
- **Deployment Platforms**: Railway (for backend), Netlify (for frontend)

---

## Setup Instructions

### Prerequisites

- JDK 17 or higher
- Maven
- MySQL (for local development)
- Git

---

### Local Development

1. **Clone the repository**:

    ```bash
    git clone https://github.com/aman031298/ToDo_List.git
    cd ToDo_List/backend
    ```

2. **Set up the MySQL database** (for local development):
   - Create a database called `todolist_db`.
   - In the `src/main/resources/application.properties`, update the connection details:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/todolist_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

3. **Build the backend**:

    ```bash
    mvn clean package
    ```

4. **Run the backend application**:

    ```bash
    mvn spring-boot:run
    ```

5. **Open the application**:
   - The application will be available at `http://localhost:8080`.

6. **Run the frontend**:
   - Open the `frontend/index.html` file in a browser to view the application.

---

## Deployment Instructions

### Deploy the Backend on Railway

1. **Create a Railway account**: Sign up at [Railway](https://railway.app/).

2. **Create a new project**:
   - From your Railway dashboard, click on "New Project".
   - Choose the option to "Deploy from GitHub" and select this repository.

3. **Configure the environment variables**:
   - In the Railway dashboard, go to the "Environment" section.
   - Add the following environment variables for database connection:
     - `DB_URL`
     - `DB_USERNAME`
     - `DB_PASSWORD`

4. **Push your code**:
   - Railway will automatically build and deploy your Spring Boot application.

5. **Access the backend**:
   - Once deployed, Railway will provide a URL to access your backend API.

---

### Deploy the Frontend on Netlify

1. **Create a Netlify account**: Sign up at [Netlify](https://www.netlify.com/).

2. **Deploy from GitHub**:
   - Go to the Netlify dashboard, and click on "New Site from Git".
   - Select this repository and choose the `frontend` folder to deploy.

3. **Configure build settings** (optional):
   - Build Command: `npm run build` (if using a build system like React, Angular, etc.)
   - Publish Directory: `frontend/` (or wherever your build files are located).

4. **Deploy**:
   - Click "Deploy" and Netlify will automatically build and host your frontend application.

5. **Access the frontend**:
   - Once deployed, Netlify will provide a URL to access your frontend.

---

## Conclusion

This project demonstrates how to build a simple full-stack web application using Spring Boot for the backend and basic HTML, CSS, and JavaScript for the frontend. By deploying the backend to **Railway** and the frontend to **Netlify**, you can easily make this project available online.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### Notes:

1. **Environment Configuration**:
   For Railway, make sure to set up the database environment variables (`DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`) in the Railway dashboard.

2. **Ensure JAR file is built**:
   Before deploying, ensure your Spring Boot project is properly built into a `.jar` file. If not, use the following Maven command to build it:

   ```bash
   mvn clean package


![image](https://github.com/user-attachments/assets/b91dcd2f-4ae2-4ec8-a3fc-aed5d04a0ee3)


