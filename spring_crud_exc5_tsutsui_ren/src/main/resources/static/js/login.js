document.addEventListener("DOMContentLoaded", function() {
	const togglePassword = document.getElementById("togglePassword");
	const passwordInput = document.getElementById("password");

	togglePassword.addEventListener("change", function() {
		if (this.checked) {
			passwordInput.type = "text";
		} else {
			passwordInput.type = "password";
		}
	});
});