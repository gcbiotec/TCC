<template>
 <div id="app">
   <div id="nav">
       <router-link to="/">Home</router-link> |
       <router-link to="/about">About</router-link>
    </div>
        <router-view/>
        <visualisation></visualisation>
  </div>
</template>

<script>
/* eslint-disable */

import Visualisation from './components/Visualisation.vue';

export default {
  name: 'appp',
  components: {
    Visualisation,
    
  }
}
</script>