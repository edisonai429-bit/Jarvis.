package com.jarvis import android.os.Bundle import 
android.widget.* import 
androidx.appcompat.app.AppCompatActivity class 
MainActivity : AppCompatActivity() {
    private lateinit var chatContainer: LinearLayout 
    private lateinit var inputText: EditText private 
    lateinit var sendButton: Button override fun 
    onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
        chatContainer = findViewById(R.id.chatContainer) 
        inputText = findViewById(R.id.inputText) 
        sendButton = findViewById(R.id.sendButton) 
        sendButton.setOnClickListener {
            val command = inputText.text.toString() if 
            (command.isNotBlank()) {
                addMessage("You: $command") 
                inputText.text.clear() 
                handleCommand(command)
            }
        }
    }
    private fun addMessage(message: String) { val textView 
        = TextView(this) textView.text = message 
        chatContainer.addView(textView)
        // Scroll to bottom
        val scrollView = 
        findViewById<ScrollView>(R.id.scrollView) 
        scrollView.post { 
        scrollView.fullScroll(ScrollView.FOCUS_DOWN) }
    }
    private fun handleCommand(command: String) {
        // Here we simulate background processing In the 
        // future, replace with AI agent logic
        Thread { val response = processCommand(command) 
            runOnUiThread { addMessage("Jarvis: 
            $response") }
        }.start()
    }
    private fun processCommand(command: String): String {
        // Minimal logic example
        return when (command.lowercase()) { "hello" -> 
            "Hello! How can I assist you?" "time" -> 
            "Current time: ${System.currentTimeMillis()}" 
            else -> "Command not recognized."
        }
    }
}
