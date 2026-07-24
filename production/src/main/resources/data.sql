INSERT INTO dbd.product_detail
(price, quantity, sku, title, created_at, updated_at)
VALUES
    (12.40, 4, 'PARLE1123', 'Parle-G Biscuit', NOW(), NOW()),
    (25.99, 2, 'MAGGI456', 'Maggi Noodles', NOW(), NOW()),
    (45.50, 5, 'LAYS789', 'Lays Classic Chips', NOW(), NOW()),
    (99.99, 1, 'AMUL101', 'Amul Butter', NOW(), NOW()),
    (150.75, 3, 'COCA202', 'Coca-Cola 2L', NOW(), NOW()),
    (35.00, 6, 'KITKAT303', 'KitKat Chocolate', NOW(), NOW()),
    (18.25, 10, 'DAIRY404', 'Dairy Milk', NOW(), NOW()),
    (220.00, 2, 'NESCA505', 'Nescafe Coffee', NOW(), NOW()),
    (75.80, 8, 'BRIT606', 'Britannia Cake', NOW(), NOW()),
    (55.60, 7, 'OREO707', 'Oreo Cookies', NOW(), NOW());



INSERT INTO dbd.patient_details
(gender, name, blood_group, email,created_at)
VALUES
    ('Male',   'Rahul Sharma',  'O_POSITIVE',  'rahul.sharma@gmail.com',now() ),
    ('Female', 'Priya Patel',   'A_POSITIVE',  'priya.patel@gmail.com',now() ),
    ('Male',   'Amit Kumar',    'B_POSITIVE',  'amit.kumar@gmail.com',now()   ),
    ('Female', 'Sneha Reddy',   'AB_POSITIVE', 'sneha.reddy@gmail.com',now())  ,
    ('Male',   'Rohan Verma',   'O_NEGATIVE',  'rohan.verma@gmail.com',now()),
    ('Female', 'Anjali Singh',  'A_NEGATIVE',  'anjali.singh@gmail.com',now() ),
    ('Male',   'Vikram Rao',    'B_NEGATIVE',  'vikram.rao@gmail.com',now()),
    ('Female', 'Neha Gupta',    'AB_NEGATIVE', 'neha.gupta@gmail.com',now()),
    ('Male',   'Karan Mehta',   'O_POSITIVE',  'karan.mehta@gmail.com',now()),
    ('Female', 'Pooja Nair',    'A_POSITIVE',  'pooja.nair@gmail.com',now());