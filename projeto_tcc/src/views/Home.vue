<template>
  
    <div class="card">
      <div class="card-body">
        <card-boas-vindas
          titulo="Bem vindo ao Data Clinic"
          subtitulo="A maneira mais fácil de entrar no mundo dos dados!"
        />
      </div>
    </div>
  
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

import CardBoasVindas from "@/components/CardBoasVindas.vue";

export default {
  name: 'Home',
  components: {
   CardBoasVindas
  }
}
</script>
