<template>
  <div id="Grafico">
    <div id="titulos">
    <h3>{{titulo}}</h3>
    <h5>{{subtitulo}}</h5>
    </div>

     <visualisation-creatinina></visualisation-creatinina>

  </div>  
</template>

<script>
import VisualisationCreatinina from '@/components/VisualisationCreatinina.vue';

export default {
    name: 'CardGrafico',
    props: {
    titulo: String,
    subtitulo: String,
  },

  components: {
      VisualisationCreatinina
    },
    
}
</script>

<style>

</style>