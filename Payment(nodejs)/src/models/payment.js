const db = require("../config/db");

class Payment {
  static create(paymentId, reservationId, status, callback) {
    const query =
      "INSERT INTO payments (paymentId, reservationId, status) VALUES (?, ?, ?)";
    db.query(query, [paymentId, reservationId, status], callback);
  }

  static updateReservationStatus(reservationId, status, callback) {
    const query = "UPDATE reservations SET status = ? WHERE id = ?";
    db.query(query, [status, reservationId], callback);
  }

  static updateTableAvailability(tableId, available, callback) {
    const query = "UPDATE restuarant_table SET available = ? WHERE id = ?";
    db.query(query, [available, tableId], callback);
  }
}

module.exports = Payment;