const API_URL = 'http://localhost:8080/bookings';

async function bookSlot(booking) {
    try {
        const response = await fetch(`${API_URL}/checkForSlot`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(booking)
        }).then(response => response.json()).catch(error => alert(error.message))
        if (response) {
            alert('Slot booked successfully!');
            window.location.href='register.html';
        } else {
            alert('Failed to book slot');
        }
    } catch (error) {
        console.error('Error:', error);
    }
}

export { bookSlot };
