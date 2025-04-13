import './App.css'

function App() {
  return (
    <div className="app-container">
      <nav className="navbar">
        <div className="nav-left">
          <h1>Message Board</h1>
        </div>

        <div className="nav-right">
          <a href="#home">Home</a>
        </div>
      </nav>

      <main className="main-content">
        <h2>Welcome to the Message Board</h2>
        <p>This is a simple message board application.</p>
      </main>

      <footer className="footer">
        <p>&copy; {new Date().getFullYear()} Message Board. All rights reserved.</p>
      </footer>
    </div>
  )
}

export default App
