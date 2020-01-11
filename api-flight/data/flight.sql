-- -----------------------------------------------------
-- Table `Passenger`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flights`.`Passenger` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(255) NOT NULL,
  `lastname` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `Flight`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flights`.`Flight` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `start` VARCHAR(255) NOT NULL,
  `end` VARCHAR(255) NOT NULL,
  `time` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `Booking`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `flights`.`Booking` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Passenger_id` INT NOT NULL,
  `Flight_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Booking_Flight1_idx` (`Flight_id` ASC),
  INDEX `fk_Booking_Passenger_idx` (`Passenger_id` ASC),
  CONSTRAINT `fk_Booking_Passenger`
    FOREIGN KEY (`Passenger_id`)
    REFERENCES `flights`.`Passenger` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Booking_Flight1`
    FOREIGN KEY (`Flight_id`)
    REFERENCES `flights`.`Flight` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION
);
