CREATE TABLE Assignments (
    AssignmentID INT PRIMARY KEY AUTO_INCREMENT,
    CourseID INT,
    Title VARCHAR(255),
    DueDate DATE,
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);