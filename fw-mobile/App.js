import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import AppDataService from './services/AppDataService';
import { SafeAreaView, StyleSheet, Text, TextInput, View, Button } from 'react-native';

export default function App() {
  const [nome, setNome] = useState('');
  const [cpf, setCpf] = useState('');
  const [telefone, setTelefone] = useState('');
  const [email, setEmail] = useState('');
  const [idade, setIdade] = useState('0');
  const [dataNascimento, setDatanascimento] = useState('');
  const [grupo, setGrupo] = useState(null);

  const handleAdd = event => {
    const pessoa = {
      nome: nome,
      cpf: cpf,
      telefone: telefone,
      email: email,
      idade: idade,
      dataNascimento: dataNascimento,
      grupo: {
        codigo: grupo
      },
    };
    AppDataService.cadastrarPessoa(pessoa);
  }

  return (
    <SafeAreaView style={styles.container}>
      <Text style={styles.title}>Cadastro eVaccine</Text>
      <TextInput style={styles.input} onChangeText={setNome} value={nome} placeholderTextColor='#FFF' placeholder="Nome"></TextInput>
      <TextInput style={styles.input} onChangeText={setCpf} value={cpf} placeholderTextColor='#FFF' placeholder="CPF"></TextInput>
      <TextInput style={styles.input} onChangeText={setTelefone} value={telefone} placeholderTextColor='#FFF' placeholder="Telefone"></TextInput>
      <TextInput style={styles.input} onChangeText={setEmail} value={email} placeholderTextColor='#FFF' placeholder="e-mail"></TextInput>
      <TextInput style={styles.input} onChangeText={setIdade} value={idade} placeholderTextColor='#FFF' placeholder="Idade"></TextInput>
      <TextInput style={styles.input} onChangeText={setDatanascimento} value={dataNascimento} placeholderTextColor='#FFF' placeholder="Data de Nascimento"></TextInput>
      <TextInput style={styles.input} onChangeText={setGrupo} value={grupo} placeholderTextColor='#FFF' placeholder="Grupo"></TextInput>
      <Button onPress={handleAdd} title="CADASTRAR"></Button>
      <StatusBar style="auto" />
      </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',

    justifyContent: 'center',
  },
  input: {
    alignItems: 'center',
    margin: 10,
    padding: 10,
    borderWidth: 1,
    borderRadius: 5,
    borderColor: '#0D458D',
    fontSize: 20,
    color: '#FFFF',
    backgroundColor: '#0D458D'
  },
  title: {
    textAlign: 'center',
    fontSize: 22,
    marginVertical: 8,
  }
});
