<template>
  <div>
    <div class="row">
      <div class="col-4"></div>
      <div class="col-8">
        <img id="imagem" src="../assets/icon-patient.png" />
        <h2>Cadastro do Paciente</h2>
        <h4>Cadastre os dados do seu paciente!</h4>
      </div>
      <div class="col-4"></div>
    </div>
      
  <div class="container">
    <div class="row">
      
      <form class="needs-validation" novalidate>
        <div id="campoDeNome" class="container">
          <input
            id="validationDefault01"
            v-model="paciente.nome"
            type="text"
            class="form-control"
            placeholder="Qual é o nome do paciente?"
          />
        </div>       
      </form>
      
    </div>
  </div>

    <div class="container">
      
      </div>
      <div class="row">
        <div class="col-3"></div>
        <div class="col-3">
        <form>
          <label id="escolhaPeso" for="formControlPeso">Escolha o peso:</label>
          <input
            id="validationDefault02"
            v-model="paciente.peso"
            type="number"
            value="1"
            min="1"
            max="100"
            step="1"
          />
        </form>
        </div>
      </div>

      <div class="row">
        <div class="col-3"></div>
        <div class="col-3">
        <form>
          <label id="escolhaIdade" for="formControlAltura"
            >Altura:</label
          >
          <input
            id="validationDefault03"
            v-model="paciente.altura"
            type="number"
            value="1"
            min="1"
            max="110"
            step="1"
          />
        </form>
        </div>
      </div>

      <div id="botao" class="container">
        <div class="row">
          <div class="col-4"></div>
          <div class="col-4">
            <button type="button" class="btn btn-primary" @click="salvar()">
              Salvar
            </button>
            <div>
              <span v-if="mensagemErro != ' '">{{ mensagemErro }}</span>
            </div>
            <div class="col-4"></div>
          </div>
        </div>
      </div>
    </div>
  
</template>

<script>
export default {
  name: "telacadastro",
  data() {
    return {
      paciente: {},

      mensagemErro: "",
      
    };
  },
  
  methods: {
    dadosValidos() {
      if (this.paciente.nome == undefined || this.paciente.nome == "") {
        return false;
      }
      return true;
    },
    salvar() {
      if (!this.dadosValidos()) {
        this.mensagemErro = "Você deve preencher o nome do paciente!";
        return;
      }

      fetch("http://localhost:8080/pacientes", {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify(this.paciente),
      }).then((response) => {
        if (response.ok) {
          alert("O paciente foi cadastrado!"), this.$router.push("/");
        }
      });
    },
  },
};
</script>

<style scoped>
#imagem {
  height: 200px;
  width: 60%;
  align-items: center;
  background-color: powderblue;
  padding-top: 40pt;
}

#campoDeNome {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
  width: 65%;
}

#botao {
  align-content: bottom;
  padding-top: 40pt;
}

#escolhaIdade {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#escolhaPeso{
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}

#escolhaDiagnostico {
  display: flex;
  flex-direction: column;
  padding-top: 40pt;
}
</style>