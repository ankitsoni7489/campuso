from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

# Predefined responses stored in a dictionary
chat_responses = {
    "hello": "Hi there! How can I assist you?",
    "how are you": "I am just a bot, but I am functioning well!",
    "what is Campuso?": "Campuso is a smart campus platform for students.",
    "bye": "Goodbye! Have a great day!",
    "help": "I can assist you with campus-related queries. Ask me anything!",
    "fees for Btech": "Total Fees for a one year is 1.5 lakh",
"exam schedule": "View your exam schedule in the Examination section.",
"transportation": "Check shuttle bus schedules and routes in the Transportation section.",
"canteen menu": "Find the daily canteen menu in the Cafeteria section.",
"faculty info": "You can find faculty details in the Faculty Info section.",
"lost and found": "Report lost items in the Lost & Found section.",
"scholarships": "Check out the External link section for funding opportunities.",

}


@app.route("/")
def index():
    return render_template("index.html")


@app.route("/get_response", methods=["POST"])
def get_response():
    user_input = request.json["message"].lower()

    # Check if input exists in dictionary, else return default message
    response = chat_responses.get(user_input, "Sorry, I don't understand. Please ask something else.")

    return jsonify({"response": response})


if __name__ == "__main__":
    app.run(debug=True)
