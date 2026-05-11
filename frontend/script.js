const API = "http://localhost:8080";

let allBooks = [];

async function loadBooks() {

    const response = await fetch(`${API}/books`);

    const books = await response.json();

    allBooks = books;

    displayBooks(books);
}

function displayBooks(books) {

    const container = document.getElementById("books-container");

    container.innerHTML = "";

    books.forEach(book => {

        let image = "";

        if (book.id === 1) {
            image = "https://picsum.photos/400/250?random=1";
        }

        else if (book.id === 2) {
            image = "https://picsum.photos/400/250?random=2";
        }

        else {
            image = "https://picsum.photos/400/250?random=3";
        }

        container.innerHTML += `
        
            <div class="book-card">

                <img src="${image}" alt="Book Image">

                <div class="book-content">

                    <h2>${book.title}</h2>

                    <p><b>Author:</b> ${book.author}</p>

                    <p class="price">₹${book.price}</p>

                    <p>${book.description}</p>

                    <button onclick="addToCart(${book.id})">
                        Add To Cart
                    </button>

                </div>

            </div>
        `;
    });
}

function searchBooks() {

    const searchValue = document
        .getElementById("search")
        .value
        .toLowerCase();

    const filteredBooks = allBooks.filter(book =>
        book.title.toLowerCase().includes(searchValue)
    );

    displayBooks(filteredBooks);
}

async function addToCart(id) {

    await fetch(`${API}/cart/${id}`, {
        method: "POST"
    });

    alert("Book Added To Cart!");
}

loadBooks();