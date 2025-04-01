-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2025 at 12:02 PM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ussos`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kierunki`
--

CREATE TABLE `kierunki` (
  `ID_kierunku` int(11) NOT NULL,
  `Nazwa kierunku` varchar(100) NOT NULL,
  `Rok` int(2) NOT NULL,
  `Typ` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kierunki`
--

INSERT INTO `kierunki` (`ID_kierunku`, `Nazwa kierunku`, `Rok`, `Typ`) VALUES
(1, 'Informatyka', 2, 'Studia stacjonarne');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `praktyki`
--

CREATE TABLE `praktyki` (
  `ID_Lab` int(5) NOT NULL,
  `ID_kierunku` int(11) NOT NULL,
  `ID_wykladowcy` int(11) NOT NULL,
  `Godzina_rozpoczecia` date NOT NULL,
  `Godzina_zakonczenia` date NOT NULL,
  `Nazwa Przedmiotu` varchar(100) NOT NULL,
  `Typ` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `przypisanie_grup`
--

CREATE TABLE `przypisanie_grup` (
  `id_lab` int(11) NOT NULL,
  `id_uzytkownika` int(11) NOT NULL,
  `grupa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uzytkownik`
--

CREATE TABLE `uzytkownik` (
  `ID` int(11) NOT NULL,
  `Login` varchar(25) NOT NULL,
  `Haslo` varchar(25) NOT NULL,
  `Imie` varchar(25) NOT NULL,
  `Nazwisko` varchar(25) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Telefon` int(10) NOT NULL,
  `Miasto` varchar(25) NOT NULL,
  `Ulice` varchar(25) NOT NULL,
  `Numer mieszkania` int(11) DEFAULT NULL,
  `Rola` char(1) NOT NULL DEFAULT 'U',
  `ID_kierunku` int(11) DEFAULT NULL,
  `Grupa` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wykladowca`
--

CREATE TABLE `wykladowca` (
  `ID_wykladowcy` int(11) NOT NULL,
  `Login` varchar(20) NOT NULL,
  `Haslo` varchar(20) NOT NULL,
  `Imie` varchar(55) NOT NULL,
  `Nazwisko` varchar(55) NOT NULL,
  `Plec` char(1) NOT NULL,
  `Wiek` int(2) NOT NULL,
  `Email` varchar(55) NOT NULL,
  `NrTel` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wyklady`
--

CREATE TABLE `wyklady` (
  `ID_Zajec` int(5) NOT NULL,
  `ID_kierunku` int(11) NOT NULL,
  `ID_wykladowcy` int(11) NOT NULL,
  `Godzina_rozpoczecia` date NOT NULL,
  `Godzina_zakonczenia` date NOT NULL,
  `Nazwa Przedmiotu` varchar(100) NOT NULL,
  `Typ` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `kierunki`
--
ALTER TABLE `kierunki`
  ADD PRIMARY KEY (`ID_kierunku`);

--
-- Indeksy dla tabeli `praktyki`
--
ALTER TABLE `praktyki`
  ADD PRIMARY KEY (`ID_Lab`),
  ADD KEY `ID_kierunku` (`ID_kierunku`,`ID_wykladowcy`),
  ADD KEY `ID_wykladowcy` (`ID_wykladowcy`);

--
-- Indeksy dla tabeli `przypisanie_grup`
--
ALTER TABLE `przypisanie_grup`
  ADD PRIMARY KEY (`id_lab`,`id_uzytkownika`),
  ADD KEY `id_uzytkownika` (`id_uzytkownika`);

--
-- Indeksy dla tabeli `uzytkownik`
--
ALTER TABLE `uzytkownik`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Foreign` (`ID_kierunku`);

--
-- Indeksy dla tabeli `wykladowca`
--
ALTER TABLE `wykladowca`
  ADD PRIMARY KEY (`ID_wykladowcy`);

--
-- Indeksy dla tabeli `wyklady`
--
ALTER TABLE `wyklady`
  ADD PRIMARY KEY (`ID_Zajec`),
  ADD KEY `ID_kierunku` (`ID_kierunku`,`ID_wykladowcy`),
  ADD KEY `ID_wykladowcy` (`ID_wykladowcy`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kierunki`
--
ALTER TABLE `kierunki`
  MODIFY `ID_kierunku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `praktyki`
--
ALTER TABLE `praktyki`
  MODIFY `ID_Lab` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `uzytkownik`
--
ALTER TABLE `uzytkownik`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `wykladowca`
--
ALTER TABLE `wykladowca`
  MODIFY `ID_wykladowcy` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `wyklady`
--
ALTER TABLE `wyklady`
  MODIFY `ID_Zajec` int(5) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `przypisanie_grup`
--
ALTER TABLE `przypisanie_grup`
  ADD CONSTRAINT `przypisanie_grup_ibfk_1` FOREIGN KEY (`id_uzytkownika`) REFERENCES `uzytkownik` (`ID`),
  ADD CONSTRAINT `przypisanie_grup_ibfk_2` FOREIGN KEY (`id_lab`) REFERENCES `praktyki` (`ID_Lab`);

--
-- Constraints for table `uzytkownik`
--
ALTER TABLE `uzytkownik`
  ADD CONSTRAINT `uzytkownik_ibfk_1` FOREIGN KEY (`ID_kierunku`) REFERENCES `kierunki` (`ID_kierunku`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `wyklady`
--
ALTER TABLE `wyklady`
  ADD CONSTRAINT `wyklady_ibfk_1` FOREIGN KEY (`ID_wykladowcy`) REFERENCES `wykladowca` (`ID_wykladowcy`),
  ADD CONSTRAINT `wyklady_ibfk_2` FOREIGN KEY (`ID_kierunku`) REFERENCES `kierunki` (`ID_kierunku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
