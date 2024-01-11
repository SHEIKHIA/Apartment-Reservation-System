# Apartment Reservation System

This project is a simple console-based apartment reservation system that allows users to add reservations, search for reservations, and view all reservations. The system utilizes a MySQL database for data persistence.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Running the Application](#running-the-application)
  - [Adding a Reservation](#adding-a-reservation)
  - [Searching for Reservations](#searching-for-reservations)
  - [Viewing All Reservations](#viewing-all-reservations)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

To run this application, you need to have the following installed on your system:

- Java Development Kit (JDK) 8 or later
- MySQL Server

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/SHEIKHIA/Apartment-Reservation-System.git
   cd apartment-reservation-system
   ```

2. Set up the MySQL database:

   - Create a new database and execute the SQL script in `database-setup.sql` to create the necessary tables.

3. Build the project:

   ```bash
   javac -d out src/*.java
   ```

## Usage

### Running the Application

Run the application using the following command:

```bash
java -cp out/ UIService
```

### Adding a Reservation

1. Choose option `1` from the main menu.
2. Enter the required details such as name, surname, start date, and duration.
3. Select an available apartment for the reservation.
4. Add information for each person staying in the apartment.

### Searching for Reservations

1. Choose option `2` from the main menu.
2. Enter the surname (you can use partial names) to search for reservations.

### Viewing All Reservations

Choose option `3` from the main menu to view all reservations.

## Contributing

If you'd like to contribute to this project, please follow the [Contributing Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).
```

Please note that the structure and content of your README may vary based on your project's specific needs and details. Customize the information to suit your application.




