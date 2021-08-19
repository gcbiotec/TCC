
<template>
    <div class="card">
      <div class="card-body">
        <card-grafico Local do Grafico>
         <h1>Local do Grafico</h1>
        </card-grafico>       
      </div>
    </div>    
</template>

<script>
import CardGrafico from "../components/CardGrafico.vue";

export default {
  name: 'TelaGraficos',
  components: {
    CardGrafico,
  },
};
</script>


 <!--dadosEstatisticos(){
        let dados = [
            {
                glicose: 12,
                hemoglobina: 14,
            },

        ];
        this.todosDados.array.forEach(paciente => {
            
        });
    } -->