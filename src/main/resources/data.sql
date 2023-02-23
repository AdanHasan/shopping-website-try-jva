DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS orders;


CREATE TABLE item (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    title varchar(300) NOT NULL ,
    price DOUBLE  NOT NULL ,
    quantity int(11) NOT NULL ,
   picture_url varchar(max) NOT NULL,
   liked BIT(1) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE user (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    password int(11) NOT NULL ,
    phone int(11) NOT NULL,
    address varchar(300) NOT NULL ,
    PRIMARY KEY (id)
);


CREATE TABLE orders (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    user_id int(11) NOT NULL DEFAULT '',
    order_date date NOT NULL DEFAULT '',
    shipping_address varchar(300) NOT NULL DEFAULT '' ,
    total_price int(11) NOT NULL ,
    status varchar(300) NOT NULL,
    item_id int(11) NOT NULL DEFAULT '',
    PRIMARY KEY (id),
     FOREIGN KEY (user_id) REFERENCES user(id),
        FOREIGN KEY (item_id) REFERENCES item(id)

);



INSERT INTO item (title , price , quantity , picture_url , liked  ) VALUES
('Oversized Check Detail Geometric Frame Sunglasses',235.59 , 10 ,'sun1.webp' , 0),
('Monogram Motif Oversized Round Frame Lola Sunglasses',321.92 , 10 , 'http.slkkfkl' ,0 ),
('Cat-eye Frame Sunglasses',261.93, 10 , 'http.slkkfkl' , 0),
('Monogram Motif Oversized Square Frame Lola Sunglasses',288.27 , 10 , 'http.slkkfkl',0),
('Logo Detail Cat-eye Frame Sunglasses',321.92, 10 , 'http.slkkfkl', 0 ),
('Check Square Frame Sunglasses',261.93, 10 , 'http.slkkfkl', 0 ),
('B Motif Square Frame Sunglasses',351.19, 10 , 'http.slkkfkl' , 0),
('Vintage Check Detail Pilot Sunglasses',261.93, 10 , 'http.slkkfkl', 0 ),
('Logo Lens D-frame Sunglasses',261.93, 10 , 'http.slkkfkl', 0 ),
('B Lens Detail Rectangular Frame Sunglasses',321.92, 10 , 'http.slkkfkl', 0 ),
('Vintage Check Detail Butterfly Frame Sunglasses',235.59, 10 , 'http.slkkfkl',0 ),
('B Motif Rectangular Frame Sunglasses',351.19, 10 , 'http.slkkfkl', 0 );
