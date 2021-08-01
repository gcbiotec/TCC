<template>
 <div id="figuraCadastro">
     <img alt="Vue Pet" src="../assets/icon-patient.png" />
     <h3>{{titulo}}</h3>
     <h5>{{subtitulo}}</h5>   
    </div>  
</template>

<script>export default {
    name: 'CardCadastro',
    props: {
    titulo: String,
    subtitulo: String,
  }
}
</script>

<style>

</style>