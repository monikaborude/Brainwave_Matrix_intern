CREATE TABLE Teachers (
    TeacherID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Subject VARCHAR(255),
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(15),
    Address TEXT
);