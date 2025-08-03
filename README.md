# 📚 Library Management System (Java)

A student-level Java console application designed to manage books and library members, showcasing **OOP principles**, file-based data storage, and menu-driven interaction.

---

## 🎯 Project Overview

This Library Management System lets users:
- Add, view, and remove books.
- Register new members.
- Issue and return books with validation.
- Persist data using plain-text files.
- Navigate via a clean command-line interface.

Perfect for learning Java fundamentals, developing structured CLI applications, and understanding basic file I/O.

---

## 🗂️ Core Features

- **Book Management**  
  – Add, list, and delete books with unique IDs.

- **Member Management**  
  – Register and view members with ID validation.

- **Issue & Return Flow**  
  – Issue books only if available; allow returns and update status.

- **Persistence**  
  – Save data across sessions using `.txt` files like `books.txt` and `members.txt`.

- **Menu-Driven Console UI**  
  – Clean, numbered options with input guidance and error handling.

---

## 🚀 Getting Started

### Prerequisites

```bash
# JDK (Java Development Kit) version 8 or higher
java -version

###LibrarySystem/
├── Main.java       # Entry point with menu navigation
├── Book.java       # Book entity (ID, title, author, availability)
├── Member.java     # Member entity (ID, name, issued books)
├── Library.java    # Core logic (handle operations and file I/O)
├── books.txt       # Stores book data (CSV or structured)
└── members.txt     # Stores member data
