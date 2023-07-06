# Bharath-Gas-Agency-Java-Project-
Project Description:
The "Gas Booking and Delivery Management System" is a Java project that provides functionality for managing gas bookings and deliveries. The project includes several classes that model customers, gas connections, bookings, and deliveries. The system allows customers to book gas cylinders, track delivery status, and manage their connection details.

Key Features:

Customer class: Represents a gas customer and stores their name, mobile number, address details, and connection information.
GasConnection class: Inherits from the Customer class and adds functionality for managing gas connection details such as the number of cylinders and the last booking date.
Booking class: Inherits from the GasConnection class and enables customers to make bookings, calculate amounts, and validate booking dates based on the number of cylinders and previous booking history.
Delivery class: Inherits from the Booking class and provides functionality for recording delivery details, verifying OTP (One-Time Password), and calculating refunds for late deliveries.
gasAgency interface: Defines constants and default methods for gas agency information such as agency name, code, and phone number.
