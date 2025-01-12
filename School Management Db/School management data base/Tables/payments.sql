CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    StudentID INT,
    PaymentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Amount DECIMAL(10, 2),
    PaymentMethod VARCHAR(50),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);