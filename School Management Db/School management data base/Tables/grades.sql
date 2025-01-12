CREATE TABLE Grades (
    GradeID INT PRIMARY KEY AUTO_INCREMENT,
    AssignmentID INT,
    StudentID INT,
    Grade DECIMAL(5, 2),
    FOREIGN KEY (AssignmentID) REFERENCES Assignments(AssignmentID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);