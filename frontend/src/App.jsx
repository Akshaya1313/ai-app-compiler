import { useState } from "react";
import axios from "axios";

function App() {
  const [prompt, setPrompt] = useState("");
  const [result, setResult] = useState(null);

  const generateApp = async () => {
    try {
      const response = await axios.post(
        "http://localhost:8080/api/generate",
        {
          prompt: prompt,
        }
      );

      setResult(response.data);
    } catch (error) {
      console.error(error);
      alert("Backend not running!");
    }
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>AI App Compiler</h1>

      <textarea
        rows="6"
        cols="80"
        placeholder="Enter app requirement..."
        value={prompt}
        onChange={(e) => setPrompt(e.target.value)}
      />

      <br />
      <br />

      <button onClick={generateApp}>
        Generate
      </button>

      <br />
      <br />

      {result && (
        <pre>
          {JSON.stringify(result, null, 2)}
        </pre>
      )}
    </div>
  );
}

export default App;