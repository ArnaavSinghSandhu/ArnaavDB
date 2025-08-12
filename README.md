# ArnaavDB
ArnaavDB – a fully functional SQL database engine written in Java.
Overview
ArnaavDB is a custom-built SQL database engine implemented entirely in Java — from parsing to query execution — without relying on existing database frameworks.
It features a custom SQL parser, execution engine, and CLI interface, allowing users to perform core database operations interactively.

This project demonstrates low-level system design, compiler-like parsing logic, and database internals knowledge — the kind of engineering behind enterprise systems like SQL Server and PostgreSQL.
Features
Custom SQL Parser

Handles INSERT, UPDATE, SELECT, and ADD COLUMN commands

Full support for WHERE clauses with logical operators AND / OR

Execution Engine

In-memory table storage with dynamic schema handling

Type-safe row and column classes

Optimized condition evaluation

Schema Evolution

Persistent storage to disk(CSV)

Primary key constraints & indexing
with fastload

<img width="1135" height="731" alt="Screenshot 2025-08-12 at 6 08 50 PM" src="https://github.com/user-attachments/assets/b964667c-3854-4299-94ba-1bd251201faf" />


ADD COLUMN support without data loss

Command-Line Interface (CLI)

Interactive shell for running SQL queries directly

Error Handling

Architecture
Parser: Implements a recursive descent parser to interpret SQL syntax into an internal query tree.

Execution Engine: Executes query trees against an in-memory table store.

Storage Layer: Table, Row, and Column classes with dynamic schema adaptation.

Future Improvements

Support for DELETE and JOIN operations


Basic query optimization
<img width="1133" height="291" alt="Screenshot 2025-08-09 at 8 16 16 PM" src="https://github.com/user-attachments/assets/1c816e09-1547-4706-9db4-07d438e982b2" />

Skills Demonstrated


Compiler & parser design (similar to ANTLR, but hand-coded)

Database engine fundamentals

Java OOP design & modular architecture


CLI development

Logical operator precedence handling



Syntax error detection with clear messages

<img width="151" height="176" alt="Screenshot 2025-08-09 at 8 17 05 PM" src="https://github.com/user-attachments/assets/08f30faa-619d-4cf1-8941-cdbe2a8474a4" />


