<template>
  <div>
    <img alt="Vue Pet" src="../assets/icon-patient.png" />

    <h2>Cadastro do Paciente</h2>
    <h4>Cadastre os dados do seu paciente!</h4>

    <form class="needs-validation" novalidate>
      <div id="campoNome" class="container">
        <input
          id="validationDefault01"
          v-model="paciente.nome"
          type="text"
          class="form-control"
          placeholder="Qual é o nome do paciente?"
        />
      </div>
    </form>

    <div class="container">
      <div class="row">
        <div id="escolhaDiagnostico" class="col-3">
          <label>Escolha o principal diagnóstico do seu paciente:</label>

          <select input v-model="paciente.diagnostico" class="dropdown">
            <option value="Infarto Agudo">Infarto Agudo</option>
            <option value="Aneurisma">Aneurisma</option>
            <option value="AVC">AVC</option>
            <option value="Endocardite">Endocardite</option>
            <option value="Insuf. Aórtica">Insuf. Aórtica</option>
            <option value="Insuf. Mitral">Insuf. Mitral</option>
            
          </select>
        </div>

        <div class="col-3">
          <form>
            <label id="escolhaPeso" for="formControlPeso"
              >Escolha o peso:</label
            >
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

        <div class="col-3">
          <form>
            <label id="escolhaIdade" for="formControlIdade"
              >Escolha a idade:</label
            >
            <input
              id="validationDefault03"
              v-model="paciente.idade"
              type="number"
              value="1"
              min="1"
              max="110"
              step="1"
            />
          </form>
        </div>

        
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
  data() {
    return {
      paciente: {},
      
      mensagemErro: "",
      listaVeterinarios: [],
    };
  },
  mounted() {
    fetch(`http://localhost:8080/veterinarios`, {
      method: "GET",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
    })
      .then((response) => {
        if (response.ok) return response.json();
      })
      .then((veterinarioJSON) => {
        this.listaVeterinarios = veterinarioJSON;
      });
  },
  methods: {
    dadosValidos() {
      if (this.cachorro.nome == undefined || this.cachorro.nome == "") {
        return false;
      }
      return true;
    },
    salvar() {
      if (!this.dadosValidos()) {
        this.mensagemErro = "Você deve preencher o nome do seu cachorro!";
        return;
      }

      fetch("http://localhost:8080/cachorros", {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify(this.cachorro),
      }).then((response) => {
        if (response.ok) {
          alert("Seu dog foi cadastrado!"), this.$router.push("/");
        }
      });
    },
  },
};
</script>

<style scoped>
#campoNome {
  width: 80%;
  padding: 20pt;
}
#campoVet {
  display: flex;
  flex-direction: column;
}
#botao {
  align-content: bottom;
  padding-top: 40pt;
}
#escolhaRaca {
  display: flex;
  flex-direction: column;
}
#escolhaPeso {
  display: flex;
  flex-direction: column;
}
#escolhaIdade {
  display: flex;
  flex-direction: column;
}
</style>

<!--
    salvarVet() {
      if (!this.dadosValidos()) {
        this.mensagemErro = "Você deve preencher o nome do seu cachorro!";
        return;
      }

      <div id="campoVet" class="col-3">
          <label>Escolha o veterinário responsável:</label>
          <select v-model="cachorro.veterinario_id">
            <option
              :key="veterinarioResponsavel.id"
              v-for="veterinarioResponsavel in listaVeterinarios"
              :value="veterinarioResponsavel.id"
            >
              {{ veterinarioResponsavel.nome }}
            </option>
          </select>
        </div>
  -->