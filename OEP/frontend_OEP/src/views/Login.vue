<template>
  <div>
    <h2>Login</h2>
    <form @submit.prevent="login">
      <div>
        <label for="username">Username:</label>
        <input type="text" id="username" v-model="username">
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" v-model="password">
      </div>
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    login() {
            fetch('http://localhost:8080/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    username: this.username,
                    password: this.password
                })
            })
            .then(response => {
                if (response.ok) {
                    // Authentication successful
                    console.log('Login successful');
                    this.$router.push('/view-patients');
                    // Redirect to the desired page or perform other actions
                } else {
                    // Authentication failed
                    console.error('Authentication failed');
                }
            })
            .catch(error => {
                console.error('Error during login:', error);
            });
        }
  }
}
</script>
