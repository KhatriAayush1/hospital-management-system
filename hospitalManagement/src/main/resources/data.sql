INSERT INTO patient(name, gender, birth_date, email, blood_group)
VALUES
    ('Aarav Sharma','MALE','1990-05-10','aarav.sharma@gmail.com','O_POSITIVE' ),
    ('Diva Patel','FEMALE','1995-02-10','diva.patel@gmail.com','A_POSITIVE' ),
    ('Dishant Verma','MALE','1988-08-09','dishant.verma@gmail.com','A_POSITIVE' ),
    ('Neha Iyer','FEMALE','1992-12-01','neha.iyer@gmail.com','AB_POSITIVE' ),
    ('Kabir Singh','MALE','1993-07-11','preeti@gmail.com','O_POSITIVE' );

INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Metha', 'Cardiology','rakhesh.metha@gmail.com'),
    ('Dr. Sneha Kapoor', 'Dermatology','sneha.kapoor@gmail.com'),
    ('Dr. Arjun Nair', 'Orthopedics','arjun.nair@gmail.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
    ('2025-07-01 10:30:00','General Checkup',1,2),
    ('2025-07-02 11:00:00','Skin Rash',2,2),
    ('2025-07-03 09:00:00','Knee Pain',3,3),
    ('2025-07-04 14:00:00','Follow0ip Visit',1,1),
    ('2025-07-05 16:15:00','Consultation',1,4),
    ('2025-07-06 08:15:00','Allergy Treatment',1,4);

