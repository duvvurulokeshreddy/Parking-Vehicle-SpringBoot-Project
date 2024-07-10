const API_URL = 'http://localhost:8080/parking-slots';

async function getSlots() {
    try {
        const response = await fetch(API_URL);
        if (response.ok) {
            const slots = await response.json();
            const slotList = document.getElementById('slotList');
            slotList.innerHTML = slots.map(slot =>
                `<div class="slot">
                    <p>Slot ID: ${slot.id}</p>
                    <p>Location: ${slot.location}</p>
                    <p>Available: ${slot.isAvailable ? 'Yes' : 'No'}</p>
                </div>`
            ).join('');
        } else {
            console.error('Failed to fetch slots');
        }
    } catch (error) {
        console.error('Error:', error);
    }
}

export { getSlots };
