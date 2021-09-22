<template>
  <div id="Grafico">
    <div id="titulos">
    <h3>{{titulo}}</h3>
    <h5>{{subtitulo}}</h5>
    </div>

     <visualisation-glicose></visualisation-glicose>

  </div>  
</template>

<script>
import VisualisationGlicose from "@/components/VisualisationGlicose.vue";

export default {
    name: 'CardGrafico',
    props: {
    titulo: String,
    subtitulo: String,
  },

  components: {
    VisualisationGlicose,
    },
    
}
</script>

<style>

</style>