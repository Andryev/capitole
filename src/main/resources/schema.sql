CREATE TABLE PRICES (
                        ID IDENTITY NOT NULL,
                        BRAND_ID INT NOT NULL,
                        PRICE_LIST INT NOT NULL,
                        PRODUCT_ID INT NOT NULL,
                        PRIORITY INT NOT NULL,
                        PRICE FLOAT NOT NULL,
                        CURR VARCHAR(3) NOT NULL,
                        START_DATE TIMESTAMP NOT NULL,
                        END_DATE TIMESTAMP NOT NULL,
                        PRIMARY KEY (ID)
);