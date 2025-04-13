import './App.css'

function App() {
  return (
    <div className="app-container">
      <nav className="navbar">
        <ul>
          <li className="title"><a href="#Home">jBoard</a></li>
          <li style={{ float: 'right' }}><a href="#Login">Login</a></li>
        </ul>
      </nav>

      <main className="main-content">
        <h2>Welcome to jBoard!</h2>
        <p>This is a simple message board application that is under construction.</p>
      </main>

      <footer className="footer">
        <p>&copy; {new Date().getFullYear()} jBoard. All rights reserved.</p>
      </footer>
    </div>
  )
}

export default App
