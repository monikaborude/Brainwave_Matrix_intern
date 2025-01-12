INSERT INTO Teachers (
    FirstName,
    LastName,
    Subject,
    Email,
    Phone,
    Address
)
VALUES
('Michael', 'Johnson', 'Mathematics',  'michael.johnson@example.com',  '555-1101', '123 Hill St'),
('Susan',   'Miller',   'Biology',     'susan.miller@example.com',     '555-1102', '456 Grove Rd'),
('Robert',  'Williams', 'Chemistry',   'robert.williams@example.com',  '555-1103', '789 Pine Ave'),
('Jennifer','Brown',    'Physics',     'jennifer.brown@example.com',   '555-1104', '101 Maple Ln'),
('Patricia','Davis',    'History',     'patricia.davis@example.com',   '555-1105', '202 Oak St'),
('Thomas',  'Garcia',   'English',     'thomas.garcia@example.com',    '555-1106', '303 Birch Pl'),
('Linda',   'Rodriguez','Geography',   'linda.rodriguez@example.com',  '555-1107', '404 Cedar Rd'),
('Charles', 'Wilson',   'Literature',  'charles.wilson@example.com',   '555-1108', '505 Aspen Blvd'),
('Daniel',  'Martinez', 'Computer Sci','daniel.martinez@example.com',  '555-1109', '606 Elm St'),
('Elizabeth','Taylor',  'Art',         'elizabeth.taylor@example.com', '555-1110', '707 Walnut Ln');
SELECT COUNT(*) AS TotalStudents
FROM teachers
;
select * from teachers;