import './App.css'
import { useState } from 'react'

function App() {
  const [data, setData] = useState<string | null>(null) //State to store API data
  const [error, setError] = useState<string | null>(null) //State to store error messages

  const fetchData = async () => {
    try {
      setError(null) // Clear any previous errors
      const response = await fetch('http://localhost:8080/api/messages') // Replace with your API endpoint
      if (!response.ok) {
        throw new Error(`Error: ${response.status} ${response.statusText}`)
      }
      const result = await response.json()
      setData(JSON.stringify(result, null, 2)) // Store the fetched data
    } catch (err: any) {
      setError(err.message) // Handle errors
    }
  }

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
        <button onClick={fetchData}>Fetch Data</button> {/* Button to trigger API call */}
        {error && <p style={{ color: 'red' }}>{error}</p>} {/* Display error if any */}
        {data && (
          <pre style={{ textAlign: 'left', backgroundColor: '#f4f4f4', padding: '1rem' }}>
            {data}
          </pre>
        )} {/* Display fetched data */}
      </main>

      <footer className="footer">
        <p>&copy; {new Date().getFullYear()} jBoard. All rights reserved.</p>
      </footer>
    </div>
  )
}

export default App
