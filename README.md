# 🚀 LRU Cache Implementation in Java

## 📌 Overview

This project implements a **Least Recently Used (LRU) Cache** using:

* **HashMap** → for O(1) access
* **Doubly Linked List** → for maintaining usage order

The cache removes the **least recently used item** when capacity is exceeded.

---

## 🧠 How It Works

### 🔹 Core Idea

* Every time a key is accessed (`get`) or inserted (`put`), it becomes **most recently used**
* The least recently used item is always at the **end of the list**
* When capacity is full → remove the **last node**

---

## 🏗️ Architecture

### 🔸 Components

1. **Node**

   * Stores `key`, `value`
   * Has pointers: `prev`, `next`

2. **D_list (Doubly Linked List)**

   * Maintains order of usage
   * Operations:

     * Add node to front
     * Remove node
     * Remove last node (LRU)
     * Move node to front

3. **LRU_Cache**

   * Contains:

     * `HashMap<Integer, Node>`
     * `D_list`
   * Provides:

     * `get(key)`
     * `put(key, value)`

4. **LRU_controller**

   * CLI-based interface to interact with cache

---

## ⚙️ Operations

### 🔹 `get(key)`

* Returns value if key exists
* Moves node to front (most recently used)
* Returns `.` if key not found

---

### 🔹 `put(key, value)`

* If key exists:

  * Update value
  * Move node to front
* If key does not exist:

  * If cache is full:

    * Remove least recently used element
  * Insert new node at front

---

## ⏱️ Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| get       | O(1)       |
| put       | O(1)       |
| remove    | O(1)       |

---

## 📂 Project Structure

```
src/
 └── main/
     ├── Node.java
     ├── D_list.java
     ├── LRU_Cache.java
     └── LRU_controller.java
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/LRU-Cache-Java.git
```

2. Open in Eclipse / IntelliJ

3. Run:

```
LRU_controller.java
```

4. Follow CLI instructions:

```
1. get
2. put
3. display
```

---

## 🧪 Example

### Input:

```
Capacity: 2
put(1, A)
put(2, B)
get(1)
put(3, C)
```

### Output:

```
Cache: [3, 1]
```

👉 Key `2` is removed because it is least recently used.

---

## 🔥 Key Features

* O(1) operations using optimized data structures
* Thread-safe methods (`synchronized`)
* Clean modular design
* CLI-based interaction

---

## 🚧 Future Improvements

* Add GUI interface
* Convert to generic cache (support any data type)
* Add persistence (store cache on disk)
* Optimize concurrency using `ReentrantLock`

---

## 🤝 Contributing

Feel free to fork this repo and improve it!

---

## 📜 License

This project is open-source and available under the MIT License.

---

## ⭐ If you like this project

Give it a star on GitHub!
