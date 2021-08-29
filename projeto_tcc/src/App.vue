<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link>
      <router-view />
    </div>
    <div>
      <!-- <visualisation></visualisation> -->
    </div>
  </div>
</template>

<script>
// import Visualisation from "@/components/Visualisation.vue";

/* eslint-disable */
export default {
  name: "app",
  components: {
    // Visualisation,
  },
};
</script>