# Polymorphism-and-Upcasting-Example

# 🇮🇹 README – Funzionamento del Programma tramite Upcasting

## 📌 Descrizione del Progetto
Questo progetto dimostra l’uso del **polimorfismo** e dell’**upcasting** in Java attraverso la simulazione del lancio di diversi tipi di dadi.  
Sono presenti due classi principali:

- **Dado** → rappresenta un dado standard (6 o 12 facce)
- **DadoGrande** → estende `Dado` e rappresenta un dado più grande (18 facce)

Il programma principale (`Es_Polimorfismo`) crea e utilizza entrambi i dadi, mostrando come l’upcasting permetta di trattare oggetti diversi attraverso un’unica interfaccia comune.

---

## 🎯 Obiettivo Didattico
L’obiettivo è mostrare come:

- una **classe derivata** (`DadoGrande`) possa essere trattata come la sua **classe base** (`Dado`)
- i **metodi sovrascritti** vengano scelti dinamicamente a runtime
- il codice possa essere scritto in modo più flessibile e riutilizzabile grazie al polimorfismo

---

## 🔧 Come Funziona il Programma

### 1. Scelta del tipo di dado
L’utente seleziona se utilizzare un dado da **6** o **12** facce.  
Questa scelta viene passata al costruttore della classe `Dado`.

### 2. Creazione degli oggetti
Nel `main` vengono creati:

```java
Dado d = new Dado(Choice());
DadoGrande dg = new DadoGrande(0);
```

Qui avviene l’**upcasting implicito**:  
`DadoGrande` → trattato come → `Dado`.

### 3. Polimorfismo nei metodi
Entrambe le classi implementano:

- `Lancio()` → genera un numero casuale
- `ConvertToString()` → converte il numero in testo

`DadoGrande` **sovrascrive** questi metodi per gestire 18 facce.

Quando il programma chiama:

```java
Gioco.Azione(d);
Gioco.Azione(dg);
```

Java decide automaticamente quale versione del metodo usare, in base al tipo reale dell’oggetto.

### 4. Risultato
Il programma stampa l’esito del lancio per:

- il dado scelto dall’utente
- il dado grande da 18 facce

---

## 📘 Concetti Chiave Dimostrati

| Concetto | Descrizione |
|---------|-------------|
| **Upcasting** | Un oggetto della sottoclasse viene trattato come oggetto della superclasse |
| **Polimorfismo** | I metodi sovrascritti vengono scelti dinamicamente a runtime |
| **Override** | `DadoGrande` ridefinisce i metodi di `Dado` |
| **Ereditarietà** | `DadoGrande` estende `Dado` |

---

## ▶ Esecuzione
Compilare ed eseguire il file:

```
Es_Polimorfismo.java
```

Il programma chiederà il tipo di dado e mostrerà i risultati dei lanci.

---

---

# 🇬🇧 README – How the Program Works Using Upcasting

## 📌 Project Description
This project demonstrates **polymorphism** and **upcasting** in Java by simulating the roll of different types of dice.  
There are two main classes:

- **Dado** → represents a standard die (6 or 12 faces)
- **DadoGrande** → extends `Dado` and represents a larger die (18 faces)

The main program (`Es_Polimorfismo`) creates and uses both dice, showing how upcasting allows different objects to be handled through a common interface.

---

## 🎯 Educational Goal
The goal is to show how:

- a **derived class** (`DadoGrande`) can be treated as its **base class** (`Dado`)
- **overridden methods** are selected dynamically at runtime
- code becomes more flexible and reusable thanks to polymorphism

---

## 🔧 How the Program Works

### 1. Choosing the die type
The user selects whether to use a **6‑face** or **12‑face** die.  
This choice is passed to the constructor of the `Dado` class.

### 2. Object creation
In the `main` method:

```java
Dado d = new Dado(Choice());
DadoGrande dg = new DadoGrande(0);
```

Here, **implicit upcasting** occurs:  
`DadoGrande` → treated as → `Dado`.

### 3. Polymorphism in methods
Both classes implement:

- `Lancio()` → generates a random number
- `ConvertToString()` → converts the number to text

`DadoGrande` **overrides** these methods to support 18 faces.

When the program calls:

```java
Gioco.Azione(d);
Gioco.Azione(dg);
```

Java automatically selects the correct method version based on the actual object type.

### 4. Output
The program prints the result of the roll for:

- the die chosen by the user
- the 18‑face large die

---

## 📘 Key Concepts Demonstrated

| Concept | Description |
|---------|-------------|
| **Upcasting** | A subclass object is treated as an instance of the superclass |
| **Polymorphism** | Overridden methods are chosen dynamically at runtime |
| **Override** | `DadoGrande` redefines the methods of `Dado` |
| **Inheritance** | `DadoGrande` extends `Dado` |

---

## ▶ Execution
Compile and run:

```
Es_Polimorfismo.java
```

The program will ask for the die type and display the roll results.
