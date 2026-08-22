# LEARNING_PHASE

This repository is a public record of my coding journey: from school Computer Science (ICSE Java, then CBSE Python) toward building **digital products** that solve real problems — not toward collecting algorithms for their own sake.

I am **Aditya Narayan Singh**. My long-term aim is to become a **Digital Product Tech Entrepreneur**: someone who can ship services people actually use. That requires more than syntax. It requires product sense, full-stack delivery, and later AI that is wired into real workflows. This repo exists so I can keep that path **organized**, and so **other learners** can open GitHub, land on this file, and know where to look without digging.

**What is live today:** school-level programs, grouped by topic.  
**What is not live yet:** a real full-stack or AI product. Those folders exist as placeholders so the repo can grow without turning into another unsorted dump.

---

## Start here (60 seconds)


| If you want…                    | Open…                                      |
| ------------------------------- | ------------------------------------------ |
| Class 8–10 Java (ICSE-style)    | `[ICSE 8-10/](./ICSE%208-10/)`             |
| Class 11–12 Python (CBSE-style) | `[CBSE 11-12/](./CBSE%2011-12/)`           |
| Upcoming web / product work     | `[FULL STACK DEV/](./FULL%20STACK%20DEV/)` |
| License                         | `[LICENSE](./LICENSE)` (MIT)               |


Each program is usually **one homework or practice question** in one file. Names follow the problem (`palin.py`, `bubble_sort.java`), not a shared app architecture. Open a topic folder, pick a file, read the comments, run it.

If you are studying for **board exams**, stay in `ICSE 8-10` or `CBSE 11-12`. If you came here for **web or AI**, the academic folders are still the foundation I am building on; the product folders will fill in as I learn.

---

## Why this repo is shaped this way

I do not treat “learning” as watching tutorials, then someday building. I treat **building small, finished programs** as the way to learn — then I file them so I can find them again.

That is why the tree is **by syllabus topic**, not by date or by random project name:

- A future-me looking for “binary search in Java” should not scroll 200 files in one folder.
- A visitor who is in Class 10 Strings should not have to guess which `.java` file is relevant.
- When full-stack and AI work starts, it will get **its own topic folders** under `FULL STACK DEV` (and later an AI area), instead of mixing HTML with palindrome programs.

This repo is **not** a production codebase. Programs are written in a school style (BlueJ / Python scripts, `Scanner`, `input()`). Copy them to **learn the idea**, then rewrite them if you ship something real (validation, secrets, error handling, tests).

---

## Repository map

```text
LEARNING_PHASE/
├── ICSE 8-10/              Java — Classes 8 to 10 (ICSE)
├── CBSE 11-12/             Python — Classes 11 and 12 (CBSE)
├── FULL STACK DEV/         Placeholder for web / product work (early)
├── README.md               You are here
└── LICENSE                 MIT, 2026, Aditya Narayan Singh
```

Local-only folders such as `.venv`, `.vscode`, and `.idea` are ignored by git. They are for my machine, not for the public tree.

---

## ICSE 8-10 (Java)

This board is **Java-first**: input with `Scanner`, loops, strings, arrays, sorting, searching, then **classes and objects**. Files are meant to be opened in **BlueJ or any other** IDE or compiled with `javac` and run with `java`. Most classes contain a `main` method.


| Folder                       | What you will find                                                                        |
| ---------------------------- | ----------------------------------------------------------------------------------------- |
| `Basics/`                    | First programs                                                                            |
| `Number Programs/`           | Duck numbers, tech numbers, factorial, even/odd, palindrome-style checks                  |
| `Patterns and Series/`       | Nested loops, Floyd’s triangle, numeric–alpha patterns, series                            |
| `Strings/`                   | Vowels, Pig Latin, frequency, passwords, case, initials, character types                  |
| `Single Dimensional Arrays/` | Max/min, digits, ICSE-style 1D array questions                                            |
| `Double Dimensional Arrays/` | Row/column sums, diagonals, 2D matrix practice                                            |
| `Searching/`                 | Linear and binary search (numbers and strings)                                            |
| `Sorting/`                   | Bubble and selection sort (ascending/descending, numeric/string variants)                 |
| `Method Overloading/`        | Same method name, different parameter lists (area, print, compute)                        |
| `Menu Driven Programs/`      | `switch` / menu loops (temperature, multi-function)                                       |
| `Classes and Objects/`       | Small real-world objects: shop, ticket, stock, courier, bike, juice, student              |
| `Practice Collections/`      | Mixed / commented dumps (`hw.java`, `Multiple_Codes.java`) — several programs in one file |
| `Non-Academic/`              | Extra practice (quiz, tic-tac-toe, cricket, graphics-style experiments)                   |


**How to run (typical):** open the `.java` file in BlueJ and click Run, or from a terminal in that folder:

```text
javac ClassName.java
java ClassName
```

The public class name must match the file name (Java rule).

**If you are using this to study:** start with `Basics` → `Number Programs` → `Patterns and Series` → `Strings` → arrays → search/sort → `Classes and Objects`. That is roughly how the skill stack is taught.

---

## CBSE 11-12 (Python and Basic AI)

This board is **Python-first**: lists, strings, tuples, dictionaries, then **text and binary files**, a slice of **SQL**, and CBSE Academic AI. Files are scripts. Run them with Python 3.


| Folder                     | What you will find                                                                |
| -------------------------- | --------------------------------------------------------------------------------- |
| `Basics/`                  | First Python programs                                                             |
| `Number Programs/`         | Primes, Armstrong, interest, quadratic roots, digit logic, series-related numbers |
| `Patterns and Series/`     | Factorial series, pyramids, nested-loop patterns                                  |
| `Lists/`                   | Input, rotate, shift, filters, primes in a list, swaps                            |
| `Strings/`                 | Palindrome, frequency, vowels, reverse, case                                      |
| `Tuples and Dictionaries/` | Mapping names/values, lengths, even tuples                                        |
| `Searching/`               | Linear search                                                                     |
| `Sorting/`                 | Ascending / descending                                                            |
| `Text File Handling/`      | Count lines/words/vowels, homework-style file questions                           |
| `Binary File Handling/`    | Record-style files (often `pickle`), search, Roman-numeral lookup                 |
| `Database Management/`     | SQL practice plus a MySQL–Python connectivity stub (CBSE-style)                   |
| `AI/`                      | First NumPy arrays and Pandas DataFrames / CSV                                    |
| `Non-Academic/`            | Turtle graphics and other extras                                                  |


Some filenames contain **spaces** (`First Prog.py`, `inputting list.py`). Quote them in the terminal:

```text
python "First Prog.py"
```

**If you are using this to study:** `Basics` → numbers/patterns → `Lists` / `Strings` → tuples & dictionaries → text files → binary files → `Database Management` → `AI`. That matches the usual Class 11–12 CS and AI path (language + files + SQL, then a data taste(AI)).

**Note:** a few programs write CSV or pickle files to a **local path** on my machine. If a script fails on your computer, change the path to a folder you own. Do not copy database passwords or private paths into a public fork.

---

## FULL STACK DEV (upcoming — not the focus yet)

This area is **scaffolding**, not a product.


| Path                       | Status                                                                                      |
| -------------------------- | ------------------------------------------------------------------------------------------- |
| `FULL STACK DEV/FRONTEND/` | Early static page (`index.html`, `style.css`, `script.js`) — first contact with the browser |
| `FULL STACK DEV/BACKEND/`  | Local helper only so far, not an HTTP API                                                   |


I will grow this when I work through **full-stack web development**: structure a real frontend, add a backend that talks over HTTP, connect data, then (later) **AI APIs and orchestration** in their own topic folders.

Until those lessons exist, **do not treat this folder as a tutorial**. The academic Java and Python trees are the complete, usable part of the repo today.

---

## How to learn from this repo (for visitors)

1. **Pick a board and a topic**, not the whole tree.
2. **Read one file end to end.** School programs are short on purpose.
3. **Run it** with your own sample input. Change one thing (a loop bound, a condition) and predict the output before you run again.
4. **Do not paste an entire folder into a submission.** Boards and teachers expect *your* variable names and logic. Use this as a **worked example**, then close it and rewrite in your own logic style.
5. **When you are ready for products**, wait for `FULL STACK DEV` to fill in — or start your own small site the same way: one page, one behaviour, then a folder for the next idea.

I am not publishing these files as “model answers.” They are **practice artifacts** from a live journey: some comments are detailed, some programs are rough, a few contain notes about inefficiency or invalid input. That honesty is part of the record.

---

## What will be added later

When I leave exam-style programs and start shipping:

- More structure under `FULL STACK DEV` (frontend UI, backend routes, maybe a small database).
- Folders for **AI integration** (calling models, tools, orchestration) once I am actually using those APIs — not empty “AI” labels.
- README updates **when those folders have real work in them**, so this file stays true.

The academic folders will stay. They are the base, not something to hide once web work starts.

---

## License

MIT License. You may use, copy, and adapt the code with attribution as described in `[LICENSE](./LICENSE)`.

If this repo helps you, the most useful thing you can do is **file your own practice the same way**: one topic, one folder, one problem per file — then go build something a stranger would actually open.