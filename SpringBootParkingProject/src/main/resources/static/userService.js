const API_URL = 'http://localhost:8080/users';

async function registerUser(user) {
    try {
        const response = await fetch(`${API_URL}/register`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(user)
        }).then(response => response.json()).catch(error => {
        console.error('Error:', error);
        alert(error.message);
    })
        if (response) {
            alert('User registered successfully!');
            window.location.href='login.html'
        } else {
            alert('Failed to register user');
        }
    } catch (error) {
        console.error('Error:', error);
    }
}

async function loginUser(user) {
    try {
        const response = await fetch(`${API_URL}/username`, {
        method: 'POST', // Specify the method as POST
        headers: {
            'Content-Type': 'application/json' // Specify that you are sending JSON data
        },
        body: JSON.stringify(user) // Convert the user object to a JSON string
    }).then(response => response.json()).catch(error => {
        console.error('Error:', error); // Log any errors
        alert(error.message);
    })
        if (response) {
            const data = response;
            console.log({data})
            if (data.password === user.password) {
                alert('Login successful!');
                window.location.href='afterlogin.html'
            } else {
                alert('Incorrect password');
            }
        } else {
            alert('User not found');
        }
    } catch (error) {
        console.error('Error:', error);
    }
}

module.exports={
	loginUser
};
