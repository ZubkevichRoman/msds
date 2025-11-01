# Java Core Final Project — Money Transfer Service

This project is a final assignment for the Java Core course at. It simulates a basic money transfer system between bank accounts using file-based input/output and demonstrates core Java concepts.

---

## Features

- Parse `.txt` files containing transfer instructions
- Validate account numbers and transfer amounts
- Update account balances after successful transfers
- Log all operations to a report file
- Move processed files to an archive folder
- Handle invalid formats, missing data, and other edge cases
- Organized by layers: `model`, `service`, `exception`, `main`

---

## Project Structure
MyFinalProject/ 
├── Input/ # Incoming transfer files (.txt) 
├── Archive/ # Processed files, report, and account balances 
│├── accounts.txt # Account balances 
│├── report.txt # Transfer log 
├── src/ 
│└── FinalProgectJavaCore/ 
│├── Main/ # Entry point 
│├── Service/ # Business logic 
│├── Exeptions/ # Custom exceptions

---

## Input File Format

- Each `.txt` file must contain:
- номер счета с:XXXXX-XXXXX
- номер счета на:YYYYY-YYYYY
- сумма для перевода:500
- Other fields are ignored. Invalid formats or negative amounts are rejected.

---

## Output Report Format

- Example entries in `report.txt`:
- 2025-11-01 13:32:12 | transfer_001.txt | перевод с 12345-67890 на 09876-54321 500 | успешно обработан
- 2025-11-01 13:32:13 | transfer_002.txt | перевод с 11111-22222 на 33333-44444 -100 | ошибка во время обработки, неверная сумма перевода
- 
---

## How to Run

1. Place `.txt` transfer files in the `Input/` folder.
2. Ensure `accounts.txt` exists in `Archive/` with format: `XXXXX-XXXXX:1000`
3. Run the program:
   - `1` — Parse and process transfers
   - `2` — View transfer history

---

## Technologies Used

- Java Core
- File I/O
- Regular Expressions
- Exception Handling
- Collections (`Map`)
- Date/Time API

---

## License

This project is for educational purposes only.



 
